package i5;

import B0.C0920d;
import N4.l;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;

/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static void a(Context context, AlertDialog alertDialog) {
        Button buttonF = alertDialog.f(-1);
        if (buttonF != null) {
            buttonF.setTransformationMethod(null);
            buttonF.setTextColor(C0920d.getColor(context, l.e.f60368b1));
        }
        Button buttonF2 = alertDialog.f(-2);
        if (buttonF2 != null) {
            buttonF2.setTransformationMethod(null);
            buttonF2.setTextColor(C0920d.getColor(context, l.e.f60353a1));
        }
        Button buttonF3 = alertDialog.f(-3);
        if (buttonF3 != null) {
            buttonF3.setTransformationMethod(null);
            buttonF3.setTextColor(C0920d.getColor(context, l.e.f60353a1));
        }
        TextView textView = (TextView) alertDialog.getWindow().findViewById(l.h.f61869D0);
        if (textView != null) {
            textView.setTextColor(C0920d.getColor(context, l.e.f60653u1));
        }
    }
}
