package androidx.compose.ui.layout;

import androidx.compose.ui.layout.H0;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.layout.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2177l implements H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102586a;

    public C2177l(int i10) {
        this.f102586a = i10;
    }

    @Override // androidx.compose.ui.layout.H0
    public void a(@NotNull H0.a aVar) {
        if (aVar.f102401a.size() > this.f102586a) {
            Iterator<Object> it = aVar.f102401a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                i10++;
                if (i10 > this.f102586a) {
                    it.remove();
                }
            }
        }
    }

    @Override // androidx.compose.ui.layout.H0
    public boolean b(@Nullable Object obj, @Nullable Object obj2) {
        return true;
    }
}
