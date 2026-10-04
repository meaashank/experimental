package com.prism.commons.utils;

import B0.C0920d;
import android.app.AlertDialog;
import android.content.Context;
import android.widget.Button;
import c6.C2947b;

/* JADX INFO: loaded from: classes5.dex */
public class h0 {
    public static void a(Context context, AlertDialog alertDialog) {
        Button button = alertDialog.getButton(-1);
        if (button != null) {
            button.setTransformationMethod(null);
            button.setTextColor(C0920d.getColor(context, C2947b.e.f127270G0));
        }
        Button button2 = alertDialog.getButton(-2);
        if (button2 != null) {
            button2.setTransformationMethod(null);
            button2.setTextColor(C0920d.getColor(context, C2947b.e.f127256F0));
        }
        Button button3 = alertDialog.getButton(-3);
        if (button3 != null) {
            button3.setTransformationMethod(null);
            button3.setTextColor(C0920d.getColor(context, C2947b.e.f127256F0));
        }
    }

    public static void b(Context context, androidx.appcompat.app.AlertDialog alertDialog) {
        Button buttonF = alertDialog.f(-1);
        if (buttonF != null) {
            buttonF.setTransformationMethod(null);
            buttonF.setTextColor(C0920d.getColor(context, C2947b.e.f127270G0));
        }
        Button buttonF2 = alertDialog.f(-2);
        if (buttonF2 != null) {
            buttonF2.setTransformationMethod(null);
            buttonF2.setTextColor(C0920d.getColor(context, C2947b.e.f127256F0));
        }
        Button buttonF3 = alertDialog.f(-3);
        if (buttonF3 != null) {
            buttonF3.setTransformationMethod(null);
            buttonF3.setTextColor(C0920d.getColor(context, C2947b.e.f127256F0));
        }
    }
}
