package x8;

import android.content.Context;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;

/* JADX INFO: renamed from: x8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5797a {
    public static BottomSheetDialog a(Context context, int i10) {
        return b(context, i10, true, true);
    }

    public static BottomSheetDialog b(Context context, int i10, boolean z10, boolean z11) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
        bottomSheetDialog.setCanceledOnTouchOutside(z10);
        bottomSheetDialog.setCancelable(z11);
        bottomSheetDialog.setContentView(i10);
        return bottomSheetDialog;
    }

    public static BottomSheetDialog c(Context context, View view, boolean z10, boolean z11) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
        bottomSheetDialog.setCanceledOnTouchOutside(z10);
        bottomSheetDialog.setCancelable(z11);
        bottomSheetDialog.setContentView(view);
        return bottomSheetDialog;
    }
}
