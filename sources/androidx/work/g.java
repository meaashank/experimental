package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.List;
import w.y;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f120264a = i.f("InputMerger");

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static g a(String className) {
        try {
            return (g) Class.forName(className).newInstance();
        } catch (Exception e10) {
            i.c().b(f120264a, y.a("Trouble instantiating + ", className), e10);
            return null;
        }
    }

    @NonNull
    public abstract Data b(@NonNull List<Data> inputs);
}
