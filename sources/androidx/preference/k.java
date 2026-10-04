package androidx.preference;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.preference.DialogPreference;
import e.G;
import e.InterfaceC4345t;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class k extends DialogFragment implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final String f115591i = "key";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f115592j = "PreferenceDialogFragment.title";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f115593k = "PreferenceDialogFragment.positiveText";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f115594l = "PreferenceDialogFragment.negativeText";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f115595m = "PreferenceDialogFragment.message";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f115596n = "PreferenceDialogFragment.layout";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f115597o = "PreferenceDialogFragment.icon";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DialogPreference f115598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f115599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f115600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f115601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f115602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @G
    public int f115603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BitmapDrawable f115604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f115605h;

    @T(30)
    public static class a {
        @InterfaceC4345t
        public static void a(@NonNull Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    @Deprecated
    public k() {
    }

    @Deprecated
    public DialogPreference a() {
        if (this.f115598a == null) {
            this.f115598a = (DialogPreference) ((DialogPreference.a) getTargetFragment()).c(getArguments().getString("key"));
        }
        return this.f115598a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean b() {
        return this instanceof b;
    }

    @Deprecated
    public void c(@NonNull View view) {
        int i10;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f115602e;
            if (TextUtils.isEmpty(charSequence)) {
                i10 = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i10 = 0;
            }
            if (viewFindViewById.getVisibility() != i10) {
                viewFindViewById.setVisibility(i10);
            }
        }
    }

    @Nullable
    @Deprecated
    public View d(@NonNull Context context) {
        int i10 = this.f115603f;
        if (i10 == 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(i10, (ViewGroup) null);
    }

    @Deprecated
    public abstract void e(boolean z10);

    @Deprecated
    public void f(@NonNull AlertDialog.Builder builder) {
    }

    public final void g(@NonNull Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(window);
        } else {
            window.setSoftInputMode(5);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    @Deprecated
    public void onClick(@NonNull DialogInterface dialogInterface, int i10) {
        this.f115605h = i10;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ComponentCallbacks2 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) targetFragment;
        String string = getArguments().getString("key");
        if (bundle != null) {
            this.f115599b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f115600c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f115601d = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f115602e = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f115603f = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f115604g = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) aVar.c(string);
        this.f115598a = dialogPreference;
        this.f115599b = dialogPreference.q1();
        this.f115600c = this.f115598a.s1();
        this.f115601d = this.f115598a.r1();
        this.f115602e = this.f115598a.p1();
        this.f115603f = this.f115598a.o1();
        Drawable drawableN1 = this.f115598a.n1();
        if (drawableN1 == null || (drawableN1 instanceof BitmapDrawable)) {
            this.f115604g = (BitmapDrawable) drawableN1;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableN1.getIntrinsicWidth(), drawableN1.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableN1.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableN1.draw(canvas);
        this.f115604g = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // android.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Activity activity = getActivity();
        this.f115605h = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f115599b).setIcon(this.f115604g).setPositiveButton(this.f115600c, this).setNegativeButton(this.f115601d, this);
        View viewD = d(activity);
        if (viewD != null) {
            c(viewD);
            negativeButton.setView(viewD);
        } else {
            negativeButton.setMessage(this.f115602e);
        }
        f(negativeButton);
        AlertDialog alertDialogCreate = negativeButton.create();
        if (b()) {
            g(alertDialogCreate);
        }
        return alertDialogCreate;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        e(this.f115605h == -1);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f115599b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f115600c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f115601d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f115602e);
        bundle.putInt("PreferenceDialogFragment.layout", this.f115603f);
        BitmapDrawable bitmapDrawable = this.f115604g;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
