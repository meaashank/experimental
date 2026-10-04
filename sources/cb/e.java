package Cb;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends a {
    public e() {
        super(6, 7);
    }

    @Override // q2.AbstractC5421c
    public void a(@NotNull v2.d db2) {
        G.p(db2, "db");
        db2.o2("ALTER TABLE 'requests' ADD COLUMN '_auto_retry_max_attempts' INTEGER NOT NULL DEFAULT '0'");
        db2.o2("ALTER TABLE 'requests' ADD COLUMN '_auto_retry_attempts' INTEGER NOT NULL DEFAULT '0'");
    }
}
