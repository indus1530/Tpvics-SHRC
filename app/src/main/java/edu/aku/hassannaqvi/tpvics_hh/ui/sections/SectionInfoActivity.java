package edu.aku.hassannaqvi.tpvics_hh.ui.sections;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.tpvics_hh.R;
import edu.aku.hassannaqvi.tpvics_hh.core.MainApp;
import edu.aku.hassannaqvi.tpvics_hh.database.DatabaseHelper;
import edu.aku.hassannaqvi.tpvics_hh.databinding.ActivitySectionInfoBinding;
import edu.aku.hassannaqvi.tpvics_hh.models.BLRandom;
import edu.aku.hassannaqvi.tpvics_hh.models.Clusters;
import edu.aku.hassannaqvi.tpvics_hh.models.FormsContract;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Schedulers;

import static edu.aku.hassannaqvi.tpvics_hh.core.MainApp.clusters;

public class SectionInfoActivity extends AppCompatActivity {

    private static final String TAG = "SectionInfoActivity";
    ActivitySectionInfoBinding bi;
    private DatabaseHelper db;
    private BLRandom bl;
    private String message = "Household found";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_info);
        bi.setCallback(this);
        db = MainApp.appInfo.getDbHelper();
        setUIComponent();

    }

    public void hh11TextChanged(CharSequence s, int start, int before, int count) {
        bi.fldGrpSectionA01.setVisibility(View.GONE);
        bi.fldGrpSectionA02.setVisibility(View.GONE);
        Clear.clearAllFields(bi.fldGrpSectionA01);
    }

    public void hh12TextChanged(CharSequence s, int start, int before, int count) {
        bi.hh12msg.setText(null);
        bi.hh12name.setText(null);
        bi.fldGrpSectionA02.setVisibility(View.GONE);
    }

    private void setUIComponent() {

        bi.hh12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //            Toast.makeText(SectionInfoActivity.this, charSequence+" i="+i+" i1="+i1+" i2="+i2, Toast.LENGTH_LONG).show();
                //     Log.d(TAG, "beforeTextChanged: "+charSequence+ " | "+i+" | "+i1+" | "+i2);

                if (i == 1 && i1 == 0 && i2 == 1) {
                    bi.hh12.setText(bi.hh12.getText().toString() + "-");
                    //         Log.d(TAG, "beforeTextChanged1: -");
                }
                if (i == 6 && i1 == 0 && i2 == 1) {
                    bi.hh12.setText(bi.hh12.getText().toString() + "-");
                    //          Log.d(TAG, "beforeTextChanged2: -");

                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //        Log.d(TAG, "onTextChanged: "+charSequence+ " | "+i+" | "+i1+" | "+i2);
                if (i == 0 && i1 == 0 && i2 == 1) {
                    bi.hh12.setText(bi.hh12.getText().toString() + "-");
                    //            Log.d(TAG, "onTextChanged1: -");
                }
                if (i == 2 && i1 == 1 && i2 == 0) {
                    bi.hh12.setText(bi.hh12.getText().toString().substring(0, 1));
                    //           Log.d(TAG, "onTextChanged2: -");

                }
                if (i == 0 && i1 == 5 && i2 == 6) {
                    bi.hh12.setText(bi.hh12.getText().toString() + "-");
                    //            Log.d(TAG, "onTextChanged3: -");

                }
                if (i == 7 && i1 == 1 && i2 == 0) {
                    bi.hh12.setText(bi.hh12.getText().toString().substring(0, 6));
                    //             Log.d(TAG, "onTextChanged4: -");

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
                bi.hh12.setSelection(bi.hh12.getText().toString().length());
            }
        });

    }

    public void BtnContinue() {
        if (formValidation()) {
            try {
                SaveDraft();
                finish();
                startActivity(new Intent(this, SectionSubInfoActivity.class));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void SaveDraft() throws JSONException {
        if (MainApp.fc != null) {
            if (MainApp.fc.getIstatus().equals("")) return;
        }
        MainApp.fc = new FormsContract();
        MainApp.fc.setUser(MainApp.user.getUserName());
        MainApp.fc.setDeviceID(MainApp.appInfo.getDeviceID());
        MainApp.fc.setDevicetagID(MainApp.appInfo.getTagName());
        MainApp.fc.setAppversion(MainApp.appInfo.getAppVersion());
        MainApp.fc.setClusterCode(bi.hh11.getText().toString());
        MainApp.fc.setHhno(bi.hh12.getText().toString().toUpperCase());
        MainApp.fc.setLuid(bl.getLUID());
        MainApp.fc.setSysDate(new SimpleDateFormat("dd-MM-yy HH:mm", Locale.ENGLISH).format(new Date().getTime()));
        //setGPS(this); // Set GPS

        JSONObject json = new JSONObject();

        json.put("imei", MainApp.IMEI);
        json.put("rndid", bl.get_ID());
        json.put("luid", bl.getLUID());
        json.put("randDT", bl.getRandomDT());
        json.put("bl_hh06", bl.getStructure());
        json.put("bl_hh11", bl.getExtension());
        json.put("hhhead", bl.getHhhead());
        json.put("bl_hh09", bl.getContact());
        json.put("hhss", bl.getSelStructure());
        //json.put("sysdate", new SimpleDateFormat("dd-MM-yy HH:mm", Locale.ENGLISH).format(new Date().getTime()));


        json.put("geoarea", bi.hh09txt.getText().toString() + ", " + bi.geoarea.getText().toString());
  /*      json.put("hh07", bi.hh07.getText().toString());
        json.put("hh08", bi.hh08.getText().toString());*/
        json.put("hh03", MainApp.user.getUserName());
        json.put("hh05", clusters.getEbcode());
        String selected = clusters.getGeoarea();
        if (!selected.equals("")) {
            String[] selSplit = selected.split("\\|");
            if (selSplit.length == 4) {
                json.put("hh06", selSplit[0]);
                json.put("hh07", selSplit[1]);
                json.put("hh08", selSplit[2]);
                //json.put("hh09", selSplit[3]);
            }
        }

        json.put("hh11", bi.hh11.getText().toString());
        json.put("hh12", bi.hh12.getText().toString());
        MainApp.fc.setsInfo(String.valueOf(json));
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.fldGrpSectionA);
    }

    public void BtnCheckCluster() {

        if (!Validator.emptyTextBox(this, bi.hh11)) return;
        boolean loginFlag;
        if (bi.hh11.getText().toString().trim().length() != 9) {
            Toast.makeText(this, "Invalid Cluster length!!", Toast.LENGTH_SHORT).show();
            return;
        }
        int cluster = Integer.parseInt(bi.hh11.getText().toString().substring(0, 3));
        if (cluster < 900) {
            loginFlag = !(MainApp.user.getUserName().equals("test1234") || MainApp.user.getUserName().equals("dmu@aku") || MainApp.user.getUserName().startsWith("user"));
        } else {
            loginFlag = MainApp.user.getUserName().equals("test1234") || MainApp.user.getUserName().equals("dmu@aku") || MainApp.user.getUserName().startsWith("user");
        }
        if (!loginFlag) {
            Toast.makeText(this, "Can't proceed test cluster for current user!!", Toast.LENGTH_SHORT).show();
            return;
        }

        //Check HH Exist or not
        getEnumerationBlock()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Clusters>() {
                    Disposable disposable;

                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        disposable = d;
                    }

                    @Override
                    public void onNext(@NonNull Clusters enumBlockContract) {
                        MainApp.clusters = enumBlockContract;
                        String selected = enumBlockContract.getGeoarea();
                        if (!selected.equals("")) {
                            String[] selSplit = selected.split("\\|");
                            bi.fldGrpSectionA01.setVisibility(View.VISIBLE);
                            bi.hh09txt.setText(selSplit[2]);
                            bi.geoarea.setTextColor(ContextCompat.getColor(SectionInfoActivity.this, R.color.gray));
                            bi.geoarea.setText(new StringBuilder(selSplit[2]).append(", ").append(selSplit[1]).append(", ").append(selSplit[0]));
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Toast.makeText(SectionInfoActivity.this, "Sorry, cluster not found!", Toast.LENGTH_SHORT).show();
                        bi.hh09txt.setText(null);
                        bi.geoarea.setText("Cluster Not Found!");
                        bi.geoarea.setTextColor(ContextCompat.getColor(SectionInfoActivity.this, R.color.red));
                        disposable.dispose();
                    }

                    @Override
                    public void onComplete() {
                        disposable.dispose();
                    }
                });
    }

    private Observable<Clusters> getEnumerationBlock() {
        return Observable.create(emitter -> {
            emitter.onNext(db.getEnumBlock(bi.hh11.getText().toString()));
            emitter.onComplete();
        });
    }

    private Observable<BLRandom> getBLRandomBlock() {
        return Observable.create(emitter -> {
            emitter.onNext(db.getHHFromBLRandom(bi.hh11.getText().toString(), bi.hh12.getText().toString().toUpperCase()));
            emitter.onComplete();
        });
    }

    private Observable<FormsContract> getFilledForm() {
        return Observable.create(emitter -> {
            emitter.onNext(db.getFilledForm(bi.hh11.getText().toString(), bi.hh12.getText().toString().toUpperCase()));
            emitter.onComplete();
        });
    }

    public void BtnCheckHH() {
        if (!Validator.emptyTextBox(this, bi.hh11)) return;
        bl = null;
        MainApp.fc = null;
        getBLRandomBlock()
                .flatMap((Function<BLRandom, Observable<FormsContract>>)
                        blRandomContract -> {
                            bl = blRandomContract;
                            return getFilledForm();
                        })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .filter(form -> {
                    if (form.getIstatus().equals("1")) {
                        message = "Household Form Exist";
                        blRandomExist(bl, message, false);
                        return false;
                    } else return true;
                })
                .subscribe(new Observer<FormsContract>() {
                    Disposable disposable;

                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        disposable = d;
                    }

                    @Override
                    public void onNext(@NonNull FormsContract form) {
                        MainApp.fc = form;
                        blRandomExist(bl, message, true);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        blRandomExist(bl, message, true);
                        disposable.dispose();
                    }

                    @Override
                    public void onComplete() {
                        disposable.dispose();
                    }
                });

    }

    private void blRandomExist(BLRandom bl, String message, Boolean flag) {
        if (bl != null) {
            bi.hh12name.setTextColor(ContextCompat.getColor(SectionInfoActivity.this, R.color.gray));
            bi.hh12msg.setText(message);
            bi.hh12name.setText(bl.getHhhead().toUpperCase());
            bi.fldGrpSectionA02.setVisibility(flag ? View.VISIBLE : View.GONE);
        } else {

            bi.hh12name.setTextColor(ContextCompat.getColor(SectionInfoActivity.this, R.color.red));
            bi.hh12name.setText("Household not found!!");
            bi.hh12msg.setText(null);
            bi.fldGrpSectionA02.setVisibility(View.GONE);
        }
    }

    public void showTooltip(@NotNull View view) {
        if (view.getId() != View.NO_ID) {
            String package_name = getApplicationContext().getPackageName();

            // Question Number Textview ID must be prefixed with q_ e.g.: 'q_aa12a'
            String infoid = view.getResources().getResourceName(view.getId()).replace(package_name + ":id/q_", "");

            // Question info text must be suffixed with _info e.g.: aa12a_info
            int stringRes = this.getResources().getIdentifier(infoid + "_info", "string", getApplicationContext().getPackageName());

            // Fetch info text from strings.xml
            //String infoText = (String) getResources().getText(stringRes);

            // Check if string resource exists to avoid crash on missing info string
            if (stringRes != 0) {

                // Fetch info text from strings.xml
                String infoText = (String) getResources().getText(stringRes);

                new AlertDialog.Builder(this)
                        .setTitle("Info: " + infoid.toUpperCase())
                        .setMessage(infoText)
                        .setIcon(android.R.drawable.ic_dialog_info)
                        .show();
            } else {
                Toast.makeText(this, "No information available on this question.", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "No ID Associated with this question.", Toast.LENGTH_SHORT).show();

        }
    }


    private void setGPS(Activity activity) {
        SharedPreferences GPSPref = activity.getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);

        try {
            String lat = GPSPref.getString("Latitude", "0");
            String lang = GPSPref.getString("Longitude", "0");
            String acc = GPSPref.getString("Accuracy", "0");
            String dt = GPSPref.getString("Time", "0");

            if (lat.equals("0") && lang.equals("0")) {
                Toast.makeText(activity, "Could not obtained GPS points", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(activity, "GPS set", Toast.LENGTH_SHORT).show();
            }

            String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

            MainApp.fc.setGpsLat(GPSPref.getString("Latitude", "0"));
            MainApp.fc.setGpsLng(GPSPref.getString("Longitude", "0"));
            MainApp.fc.setGpsAcc(GPSPref.getString("Accuracy", "0"));
//            MainApp.fc.setGpsTime(GPSPref.getString(date, "0")); // Timestamp is converted to date above
            MainApp.fc.setGpsDT(date); // Timestamp is converted to date above

        } catch (Exception e) {
            Log.e("GPS", "setGPS: " + e.getMessage());
        }
    }

}
