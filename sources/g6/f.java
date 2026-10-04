package g6;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class f implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f202265a;

    public f(Runnable runnable) {
        this.f202265a = runnable;
    }

    public int a(@NonNull q qVar) {
        return 0;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(@NonNull q qVar) {
        return 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f202265a.run();
    }
}
