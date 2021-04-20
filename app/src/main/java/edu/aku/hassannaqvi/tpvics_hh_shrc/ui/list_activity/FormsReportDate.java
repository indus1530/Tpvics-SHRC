package edu.aku.hassannaqvi.tpvics_hh_shrc.ui.list_activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import edu.aku.hassannaqvi.tpvics_hh_shrc.R;
import edu.aku.hassannaqvi.tpvics_hh_shrc.adapters.FormsAdapter;
import edu.aku.hassannaqvi.tpvics_hh_shrc.database.DatabaseHelper;
import edu.aku.hassannaqvi.tpvics_hh_shrc.models.FormsContract;

public class FormsReportDate extends AppCompatActivity {
    DatabaseHelper db;
    Collection<FormsContract> fc;
    String sysdateToday = new SimpleDateFormat("dd-MM-yy").format(new Date());
    TextView dtFilter;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter formsAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms_report_date);
        recyclerView = findViewById(R.id.fc_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        dtFilter = findViewById(R.id.dtFilter);
        db = new DatabaseHelper(this);
        fc = db.getTodayForms(sysdateToday);

        // specify an adapter (see also next example)
        formsAdapter = new FormsAdapter((List<FormsContract>) fc, this);
        recyclerView.setAdapter(formsAdapter);
    }

    public void filterForms(View view) {
        Toast.makeText(this, "updated", Toast.LENGTH_SHORT).show();
        fc = db.getTodayForms(dtFilter.getText().toString());
        formsAdapter = new FormsAdapter((List<FormsContract>) fc, this);
        formsAdapter.notifyDataSetChanged();
        recyclerView.setAdapter(formsAdapter);

    }
}