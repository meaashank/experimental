package Cb;

import com.tonyodev.fetch2.EnqueueAction;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends a {
    public g() {
        super(2, 3);
    }

    @Override // q2.AbstractC5421c
    public void a(@NotNull v2.d db2) {
        G.p(db2, "db");
        db2.o2("ALTER TABLE 'requests' ADD COLUMN '_enqueue_action' INTEGER NOT NULL DEFAULT " + EnqueueAction.REPLACE_EXISTING.getValue());
    }
}
