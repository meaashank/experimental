package kotlin.uuid;

import java.security.SecureRandom;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f218484a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SecureRandom f218485b = new SecureRandom();

    @NotNull
    public final SecureRandom a() {
        return f218485b;
    }
}
