package androidx.compose.runtime.saveable;

import ed.l;
import ed.p;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class SaverKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e<Object, Object> f100022a = new a(new p<f, Object, Object>() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$1
        @Nullable
        public final Object e(@NotNull f fVar, @Nullable Object obj) {
            return obj;
        }

        @Override // ed.p
        public Object invoke(f fVar, Object obj) {
            return obj;
        }
    }, new l<Object, Object>() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$2
        @Override // ed.l
        @Nullable
        public final Object invoke(@NotNull Object obj) {
            return obj;
        }
    });

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    public static final class a<Original, Saveable> implements e<Original, Saveable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p<f, Original, Saveable> f100025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Saveable, Original> f100026b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super f, ? super Original, ? extends Saveable> pVar, l<? super Saveable, ? extends Original> lVar) {
            this.f100025a = pVar;
            this.f100026b = lVar;
        }

        @Override // androidx.compose.runtime.saveable.e
        @Nullable
        public Saveable a(@NotNull f fVar, Original original) {
            return this.f100025a.invoke(fVar, original);
        }

        @Override // androidx.compose.runtime.saveable.e
        @Nullable
        public Original b(@NotNull Saveable saveable) {
            return this.f100026b.invoke(saveable);
        }
    }

    @NotNull
    public static final <Original, Saveable> e<Original, Saveable> a(@NotNull p<? super f, ? super Original, ? extends Saveable> pVar, @NotNull l<? super Saveable, ? extends Original> lVar) {
        return new a(pVar, lVar);
    }

    @NotNull
    public static final <T> e<T, Object> b() {
        e<T, Object> eVar = (e<T, Object>) f100022a;
        G.n(eVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return eVar;
    }
}
