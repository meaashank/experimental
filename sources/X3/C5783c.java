package x3;

import androidx.annotation.NonNull;
import g3.InterfaceC4444b;
import java.security.MessageDigest;

/* JADX INFO: renamed from: x3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5783c implements InterfaceC4444b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C5783c f240485c = new C5783c();

    @NonNull
    public static C5783c c() {
        return f240485c;
    }

    public String toString() {
        return "EmptySignature";
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
    }
}
