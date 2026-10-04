package od;

import Xc.f;
import dd.j;

/* JADX INFO: renamed from: od.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@j(name = "ProcessKt")
public final class C5349a {
    @f
    public static final Void a(int i10) {
        System.exit(i10);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
