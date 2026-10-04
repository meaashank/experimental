package W1;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.B;
import androidx.lifecycle.q0;
import androidx.loader.content.c;
import e.I;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: W1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0129a<D> {
        @NonNull
        @I
        c<D> onCreateLoader(int i10, @Nullable Bundle bundle);

        @I
        void onLoadFinished(@NonNull c<D> cVar, D d10);

        @I
        void onLoaderReset(@NonNull c<D> cVar);
    }

    public static void c(boolean z10) {
        b.f76511d = z10;
    }

    @NonNull
    public static <T extends B & q0> a d(@NonNull T t10) {
        return new b(t10, t10.getViewModelStore());
    }

    @I
    public abstract void a(int i10);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @Nullable
    public abstract <D> c<D> e(int i10);

    public boolean f() {
        return false;
    }

    @NonNull
    @I
    public abstract <D> c<D> g(int i10, @Nullable Bundle bundle, @NonNull InterfaceC0129a<D> interfaceC0129a);

    public abstract void h();

    @NonNull
    @I
    public abstract <D> c<D> i(int i10, @Nullable Bundle bundle, @NonNull InterfaceC0129a<D> interfaceC0129a);
}
