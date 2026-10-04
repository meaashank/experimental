package androidx.compose.runtime.saveable;

import ed.l;
import ed.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ListSaverKt {
    @NotNull
    public static final <Original, Saveable> e<Original, Object> a(@NotNull final p<? super f, ? super Original, ? extends List<? extends Saveable>> pVar, @NotNull l<? super List<? extends Saveable>, ? extends Original> lVar) {
        p<f, Original, Object> pVar2 = new p<f, Original, Object>() { // from class: androidx.compose.runtime.saveable.ListSaverKt$listSaver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // ed.p
            @Nullable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull f fVar, Original original) {
                List list = (List) pVar.invoke(fVar, original);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = list.get(i10);
                    if (obj != null && !fVar.a(obj)) {
                        throw new IllegalArgumentException("item can't be saved");
                    }
                }
                List list2 = list;
                if (list2.isEmpty()) {
                    return null;
                }
                return new ArrayList(list2);
            }
        };
        G.n(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        Y.q(lVar, 1);
        return SaverKt.a(pVar2, lVar);
    }
}
