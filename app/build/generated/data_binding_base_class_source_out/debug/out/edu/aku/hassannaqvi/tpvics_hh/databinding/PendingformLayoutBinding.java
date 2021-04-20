// Generated by data binding compiler. Do not edit!
package edu.aku.hassannaqvi.tpvics_hh.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import edu.aku.hassannaqvi.tpvics_hh.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PendingformLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView cluster;

  @NonNull
  public final TextView hhno;

  @NonNull
  public final TextView istatus;

  @NonNull
  public final CardView parentLayout;

  @NonNull
  public final ImageView status;

  @NonNull
  public final TextView sysdate;

  protected PendingformLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView cluster, TextView hhno, TextView istatus, CardView parentLayout, ImageView status,
      TextView sysdate) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cluster = cluster;
    this.hhno = hhno;
    this.istatus = istatus;
    this.parentLayout = parentLayout;
    this.status = status;
    this.sysdate = sysdate;
  }

  @NonNull
  public static PendingformLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.pendingform_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PendingformLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PendingformLayoutBinding>inflateInternal(inflater, R.layout.pendingform_layout, root, attachToRoot, component);
  }

  @NonNull
  public static PendingformLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.pendingform_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PendingformLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PendingformLayoutBinding>inflateInternal(inflater, R.layout.pendingform_layout, null, false, component);
  }

  public static PendingformLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static PendingformLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (PendingformLayoutBinding)bind(component, view, R.layout.pendingform_layout);
  }
}
