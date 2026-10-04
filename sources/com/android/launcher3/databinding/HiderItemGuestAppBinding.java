package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderItemGuestAppBinding implements b {

    @NonNull
    public final ImageView guestIcon;

    @NonNull
    public final TextView guestName;

    @NonNull
    public final TextView guestOffChip;

    @NonNull
    public final TextView guestPkg;

    @NonNull
    public final View guestRunningDot;

    @NonNull
    public final TextView guestSize;

    @NonNull
    public final TextView guestVuser;

    @NonNull
    private final LinearLayout rootView;

    private HiderItemGuestAppBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = linearLayout;
        this.guestIcon = imageView;
        this.guestName = textView;
        this.guestOffChip = textView2;
        this.guestPkg = textView3;
        this.guestRunningDot = view;
        this.guestSize = textView4;
        this.guestVuser = textView5;
    }

    @NonNull
    public static HiderItemGuestAppBinding bind(@NonNull View view) {
        int i10 = R.id.guest_icon;
        ImageView imageView = (ImageView) c.a(view, R.id.guest_icon);
        if (imageView != null) {
            i10 = R.id.guest_name;
            TextView textView = (TextView) c.a(view, R.id.guest_name);
            if (textView != null) {
                i10 = R.id.guest_off_chip;
                TextView textView2 = (TextView) c.a(view, R.id.guest_off_chip);
                if (textView2 != null) {
                    i10 = R.id.guest_pkg;
                    TextView textView3 = (TextView) c.a(view, R.id.guest_pkg);
                    if (textView3 != null) {
                        i10 = R.id.guest_running_dot;
                        View viewA = c.a(view, R.id.guest_running_dot);
                        if (viewA != null) {
                            i10 = R.id.guest_size;
                            TextView textView4 = (TextView) c.a(view, R.id.guest_size);
                            if (textView4 != null) {
                                i10 = R.id.guest_vuser;
                                TextView textView5 = (TextView) c.a(view, R.id.guest_vuser);
                                if (textView5 != null) {
                                    return new HiderItemGuestAppBinding((LinearLayout) view, imageView, textView, textView2, textView3, viewA, textView4, textView5);
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
    public static HiderItemGuestAppBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderItemGuestAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_item_guest_app, viewGroup, false);
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
