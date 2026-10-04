package n5;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Comparable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f221241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f221242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public String f221243c;

    public b(int i10, @NonNull String str) {
        this.f221242b = "";
        this.f221243c = str;
        this.f221241a = i10;
        this.f221242b = str.toLowerCase();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull String str) {
        return this.f221242b.startsWith(str.toLowerCase()) ? 0 : -1;
    }

    @NonNull
    public String b() {
        return this.f221243c;
    }

    public int c() {
        return this.f221241a;
    }

    public void d(@NonNull String str) {
        this.f221243c = str;
    }

    public void e(int i10) {
        this.f221241a = i10;
    }

    public String toString() {
        return b();
    }
}
