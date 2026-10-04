package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderDialogAppOperationBinding implements b {

    @NonNull
    public final TextView btCancel;

    @NonNull
    public final TextView btConfirm;

    @NonNull
    public final ImageView btImportAppClose;

    @NonNull
    public final CheckBox cbNotNextTime;

    @NonNull
    public final ImageView ivImportAppIcon1;

    @NonNull
    public final ImageView ivImportAppIcon2;

    @NonNull
    public final LinearLayout llNotNextTime;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvImportAppDesc;

    @NonNull
    public final TextView tvImportAppTitle;

    @NonNull
    public final TextView tvNotNextTime;

    private HiderDialogAppOperationBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull CheckBox checkBox, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = linearLayout;
        this.btCancel = textView;
        this.btConfirm = textView2;
        this.btImportAppClose = imageView;
        this.cbNotNextTime = checkBox;
        this.ivImportAppIcon1 = imageView2;
        this.ivImportAppIcon2 = imageView3;
        this.llNotNextTime = linearLayout2;
        this.tvImportAppDesc = textView3;
        this.tvImportAppTitle = textView4;
        this.tvNotNextTime = textView5;
    }

    @NonNull
    public static HiderDialogAppOperationBinding bind(@NonNull View view) {
        int i10 = R.id.bt_cancel;
        TextView textView = (TextView) c.a(view, R.id.bt_cancel);
        if (textView != null) {
            i10 = R.id.bt_confirm;
            TextView textView2 = (TextView) c.a(view, R.id.bt_confirm);
            if (textView2 != null) {
                i10 = R.id.bt_import_app_close;
                ImageView imageView = (ImageView) c.a(view, R.id.bt_import_app_close);
                if (imageView != null) {
                    i10 = R.id.cb_not_next_time;
                    CheckBox checkBox = (CheckBox) c.a(view, R.id.cb_not_next_time);
                    if (checkBox != null) {
                        i10 = R.id.iv_import_app_icon1;
                        ImageView imageView2 = (ImageView) c.a(view, R.id.iv_import_app_icon1);
                        if (imageView2 != null) {
                            i10 = R.id.iv_import_app_icon2;
                            ImageView imageView3 = (ImageView) c.a(view, R.id.iv_import_app_icon2);
                            if (imageView3 != null) {
                                i10 = R.id.ll_not_next_time;
                                LinearLayout linearLayout = (LinearLayout) c.a(view, R.id.ll_not_next_time);
                                if (linearLayout != null) {
                                    i10 = R.id.tv_import_app_desc;
                                    TextView textView3 = (TextView) c.a(view, R.id.tv_import_app_desc);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_import_app_title;
                                        TextView textView4 = (TextView) c.a(view, R.id.tv_import_app_title);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_not_next_time;
                                            TextView textView5 = (TextView) c.a(view, R.id.tv_not_next_time);
                                            if (textView5 != null) {
                                                return new HiderDialogAppOperationBinding((LinearLayout) view, textView, textView2, imageView, checkBox, imageView2, imageView3, linearLayout, textView3, textView4, textView5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static HiderDialogAppOperationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderDialogAppOperationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_dialog_app_operation, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
