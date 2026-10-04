package r1;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4326A;
import q1.l;

/* JADX INFO: renamed from: r1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5516b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f227127a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC4326A("INSTANCE_LOCK")
    public static volatile Editable.Factory f227128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static Class<?> f227129c;

    @SuppressLint({"PrivateApi"})
    public C5516b() {
        try {
            f227129c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C5516b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f227128b == null) {
            synchronized (f227127a) {
                try {
                    if (f227128b == null) {
                        f227128b = new C5516b();
                    }
                } finally {
                }
            }
        }
        return f227128b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = f227129c;
        return cls != null ? l.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
