package Cb;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends a {
    public f() {
        super(3, 4);
    }

    @Override // q2.AbstractC5421c
    public void a(@NotNull v2.d db2) {
        G.p(db2, "db");
        db2.o2("ALTER TABLE 'requests' ADD COLUMN '_identifier' INTEGER NOT NULL DEFAULT 0");
    }
}
