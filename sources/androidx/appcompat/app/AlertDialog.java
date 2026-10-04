package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertController;
import e.InterfaceC4331e;
import e.InterfaceC4332f;
import e.InterfaceC4346u;
import e.Z;
import e.a0;
import g.C4426a;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialog extends w implements DialogInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85213b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f85214c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AlertController f85215a;

    public static class Builder {

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private final AlertController.f f85216P;
        private final int mTheme;

        public Builder(@NonNull Context context) {
            this(context, AlertDialog.h(context, 0));
        }

        @NonNull
        public AlertDialog create() {
            AlertDialog alertDialog = new AlertDialog(this.f85216P.f85173a, this.mTheme);
            this.f85216P.a(alertDialog.f85215a);
            alertDialog.setCancelable(this.f85216P.f85190r);
            if (this.f85216P.f85190r) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.f85216P.f85191s);
            alertDialog.setOnDismissListener(this.f85216P.f85192t);
            DialogInterface.OnKeyListener onKeyListener = this.f85216P.f85193u;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        @NonNull
        public Context getContext() {
            return this.f85216P.f85173a;
        }

        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f85216P;
            fVar.f85195w = listAdapter;
            fVar.f85196x = onClickListener;
            return this;
        }

        public Builder setCancelable(boolean z10) {
            this.f85216P.f85190r = z10;
            return this;
        }

        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.f fVar = this.f85216P;
            fVar.f85166K = cursor;
            fVar.f85167L = str;
            fVar.f85196x = onClickListener;
            return this;
        }

        public Builder setCustomTitle(@Nullable View view) {
            this.f85216P.f85179g = view;
            return this;
        }

        public Builder setIcon(@InterfaceC4346u int i10) {
            this.f85216P.f85175c = i10;
            return this;
        }

        public Builder setIconAttribute(@InterfaceC4332f int i10) {
            TypedValue typedValue = new TypedValue();
            this.f85216P.f85173a.getTheme().resolveAttribute(i10, typedValue, true);
            this.f85216P.f85175c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public Builder setInverseBackgroundForced(boolean z10) {
            this.f85216P.f85169N = z10;
            return this;
        }

        public Builder setItems(@InterfaceC4331e int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f85216P;
            fVar.f85194v = fVar.f85173a.getResources().getTextArray(i10);
            this.f85216P.f85196x = onClickListener;
            return this;
        }

        public Builder setMessage(@Z int i10) {
            AlertController.f fVar = this.f85216P;
            fVar.f85180h = fVar.f85173a.getText(i10);
            return this;
        }

        public Builder setMultiChoiceItems(@InterfaceC4331e int i10, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f85216P;
            fVar.f85194v = fVar.f85173a.getResources().getTextArray(i10);
            AlertController.f fVar2 = this.f85216P;
            fVar2.f85165J = onMultiChoiceClickListener;
            fVar2.f85161F = zArr;
            fVar2.f85162G = true;
            return this;
        }

        public Builder setNegativeButton(@Z int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f85216P;
            fVar.f85184l = fVar.f85173a.getText(i10);
            this.f85216P.f85186n = onClickListener;
            return this;
        }

        public Builder setNegativeButtonIcon(Drawable drawable) {
            this.f85216P.f85185m = drawable;
            return this;
        }

        public Builder setNeutralButton(@Z int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f85216P;
            fVar.f85187o = fVar.f85173a.getText(i10);
            this.f85216P.f85189q = onClickListener;
            return this;
        }

        public Builder setNeutralButtonIcon(Drawable drawable) {
            this.f85216P.f85188p = drawable;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f85216P.f85191s = onCancelListener;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f85216P.f85192t = onDismissListener;
            return this;
        }

        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f85216P.f85170O = onItemSelectedListener;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f85216P.f85193u = onKeyListener;
            return this;
        }

        public Builder setPositiveButton(@Z int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f85216P;
            fVar.f85181i = fVar.f85173a.getText(i10);
            this.f85216P.f85183k = onClickListener;
            return this;
        }

        public Builder setPositiveButtonIcon(Drawable drawable) {
            this.f85216P.f85182j = drawable;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder setRecycleOnMeasureEnabled(boolean z10) {
            this.f85216P.f85172Q = z10;
            return this;
        }

        public Builder setSingleChoiceItems(@InterfaceC4331e int i10, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f85216P;
            fVar.f85194v = fVar.f85173a.getResources().getTextArray(i10);
            AlertController.f fVar2 = this.f85216P;
            fVar2.f85196x = onClickListener;
            fVar2.f85164I = i11;
            fVar2.f85163H = true;
            return this;
        }

        public Builder setTitle(@Z int i10) {
            AlertController.f fVar = this.f85216P;
            fVar.f85178f = fVar.f85173a.getText(i10);
            return this;
        }

        public Builder setView(int i10) {
            AlertController.f fVar = this.f85216P;
            fVar.f85198z = null;
            fVar.f85197y = i10;
            fVar.f85160E = false;
            return this;
        }

        public AlertDialog show() {
            AlertDialog alertDialogCreate = create();
            alertDialogCreate.show();
            return alertDialogCreate;
        }

        public Builder(@NonNull Context context, @a0 int i10) {
            this.f85216P = new AlertController.f(new ContextThemeWrapper(context, AlertDialog.h(context, i10)));
            this.mTheme = i10;
        }

        public Builder setIcon(@Nullable Drawable drawable) {
            this.f85216P.f85176d = drawable;
            return this;
        }

        public Builder setMessage(@Nullable CharSequence charSequence) {
            this.f85216P.f85180h = charSequence;
            return this;
        }

        public Builder setTitle(@Nullable CharSequence charSequence) {
            this.f85216P.f85178f = charSequence;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f85216P;
            fVar.f85194v = charSequenceArr;
            fVar.f85196x = onClickListener;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f85216P;
            fVar.f85184l = charSequence;
            fVar.f85186n = onClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f85216P;
            fVar.f85187o = charSequence;
            fVar.f85189q = onClickListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f85216P;
            fVar.f85181i = charSequence;
            fVar.f85183k = onClickListener;
            return this;
        }

        public Builder setView(View view) {
            AlertController.f fVar = this.f85216P;
            fVar.f85198z = view;
            fVar.f85197y = 0;
            fVar.f85160E = false;
            return this;
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f85216P;
            fVar.f85194v = charSequenceArr;
            fVar.f85165J = onMultiChoiceClickListener;
            fVar.f85161F = zArr;
            fVar.f85162G = true;
            return this;
        }

        public Builder setSingleChoiceItems(Cursor cursor, int i10, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f85216P;
            fVar.f85166K = cursor;
            fVar.f85196x = onClickListener;
            fVar.f85164I = i10;
            fVar.f85167L = str;
            fVar.f85163H = true;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public Builder setView(View view, int i10, int i11, int i12, int i13) {
            AlertController.f fVar = this.f85216P;
            fVar.f85198z = view;
            fVar.f85197y = 0;
            fVar.f85160E = true;
            fVar.f85156A = i10;
            fVar.f85157B = i11;
            fVar.f85158C = i12;
            fVar.f85159D = i13;
            return this;
        }

        public Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f85216P;
            fVar.f85166K = cursor;
            fVar.f85165J = onMultiChoiceClickListener;
            fVar.f85168M = str;
            fVar.f85167L = str2;
            fVar.f85162G = true;
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f85216P;
            fVar.f85194v = charSequenceArr;
            fVar.f85196x = onClickListener;
            fVar.f85164I = i10;
            fVar.f85163H = true;
            return this;
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f85216P;
            fVar.f85195w = listAdapter;
            fVar.f85196x = onClickListener;
            fVar.f85164I = i10;
            fVar.f85163H = true;
            return this;
        }
    }

    public AlertDialog(@NonNull Context context) {
        this(context, 0);
    }

    public static int h(@NonNull Context context, @a0 int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C4426a.b.f200770N, typedValue, true);
        return typedValue.resourceId;
    }

    public Button f(int i10) {
        return this.f85215a.c(i10);
    }

    public ListView g() {
        return this.f85215a.e();
    }

    public void i(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f85215a.l(i10, charSequence, onClickListener, null, null);
    }

    public void j(int i10, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f85215a.l(i10, charSequence, onClickListener, null, drawable);
    }

    public void k(int i10, CharSequence charSequence, Message message) {
        this.f85215a.l(i10, charSequence, null, message, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void l(int i10) {
        this.f85215a.m(i10);
    }

    public void m(View view) {
        this.f85215a.n(view);
    }

    public void n(int i10) {
        this.f85215a.o(i10);
    }

    public void o(Drawable drawable) {
        this.f85215a.p(drawable);
    }

    @Override // androidx.appcompat.app.w, androidx.activity.o, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f85215a.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f85215a.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f85215a.i(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public void p(int i10) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i10, typedValue, true);
        this.f85215a.o(typedValue.resourceId);
    }

    public void q(CharSequence charSequence) {
        this.f85215a.q(charSequence);
    }

    public void r(View view) {
        this.f85215a.u(view);
    }

    public void s(View view, int i10, int i11, int i12, int i13) {
        this.f85215a.v(view, i10, i11, i12, i13);
    }

    @Override // androidx.appcompat.app.w, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f85215a.s(charSequence);
    }

    public AlertDialog(@NonNull Context context, @a0 int i10) {
        super(context, h(context, i10));
        this.f85215a = new AlertController(getContext(), this, getWindow());
    }

    public AlertDialog(@NonNull Context context, boolean z10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z10);
        setOnCancelListener(onCancelListener);
    }
}
