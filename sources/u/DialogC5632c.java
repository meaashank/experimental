package u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: u.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class DialogC5632c extends Dialog {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f239293b = 250;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f239294c = 150;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f239295a;

    /* JADX INFO: renamed from: u.c$a */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f239296a;

        public a(boolean z10) {
            this.f239296a = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f239296a) {
                return;
            }
            DialogC5632c.super.dismiss();
        }
    }

    public DialogC5632c(Context context, View view) {
        super(context);
        this.f239295a = view;
    }

    public final void b(boolean z10) {
        float f10 = z10 ? 0.0f : 1.0f;
        float f11 = z10 ? 1.0f : 0.0f;
        long j10 = z10 ? 250L : 150L;
        this.f239295a.setScaleX(f10);
        this.f239295a.setScaleY(f10);
        this.f239295a.animate().scaleX(f11).scaleY(f11).setDuration(j10).setInterpolator(new B1.c()).setListener(new a(z10)).start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        b(false);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // android.app.Dialog
    public void show() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        b(true);
        super.show();
    }
}
