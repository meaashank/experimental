package P2;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f65542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f65543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f65544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f65545d;

    public b(boolean isConnected, boolean isValidated, boolean isMetered, boolean isNotRoaming) {
        this.f65542a = isConnected;
        this.f65543b = isValidated;
        this.f65544c = isMetered;
        this.f65545d = isNotRoaming;
    }

    public boolean a() {
        return this.f65542a;
    }

    public boolean b() {
        return this.f65544c;
    }

    public boolean c() {
        return this.f65545d;
    }

    public boolean d() {
        return this.f65543b;
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof b)) {
            return false;
        }
        b bVar = (b) o10;
        return this.f65542a == bVar.f65542a && this.f65543b == bVar.f65543b && this.f65544c == bVar.f65544c && this.f65545d == bVar.f65545d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.f65542a;
        int i10 = r02;
        if (this.f65543b) {
            i10 = r02 + 16;
        }
        int i11 = i10;
        if (this.f65544c) {
            i11 = i10 + 256;
        }
        return this.f65545d ? i11 + 4096 : i11;
    }

    @NonNull
    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f65542a), Boolean.valueOf(this.f65543b), Boolean.valueOf(this.f65544c), Boolean.valueOf(this.f65545d));
    }
}
