package Cb;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends a {
    public c() {
        super(4, 5);
    }

    @Override // q2.AbstractC5421c
    public void a(@NotNull v2.d db2) {
        G.p(db2, "db");
        db2.o2("ALTER TABLE 'requests' ADD COLUMN '_download_on_enqueue' INTEGER NOT NULL DEFAULT 1");
    }
}
