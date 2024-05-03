// Generated by view binder compiler. Do not edit!
package com.fiap.cp2suppliers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.fiap.cp2suppliers.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SupplierItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView supplierCategoryList;

  @NonNull
  public final TextView supplierNameList;

  private SupplierItemBinding(@NonNull LinearLayout rootView,
      @NonNull TextView supplierCategoryList, @NonNull TextView supplierNameList) {
    this.rootView = rootView;
    this.supplierCategoryList = supplierCategoryList;
    this.supplierNameList = supplierNameList;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SupplierItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SupplierItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.supplier_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SupplierItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.supplier_category_list;
      TextView supplierCategoryList = ViewBindings.findChildViewById(rootView, id);
      if (supplierCategoryList == null) {
        break missingId;
      }

      id = R.id.supplier_name_list;
      TextView supplierNameList = ViewBindings.findChildViewById(rootView, id);
      if (supplierNameList == null) {
        break missingId;
      }

      return new SupplierItemBinding((LinearLayout) rootView, supplierCategoryList,
          supplierNameList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
