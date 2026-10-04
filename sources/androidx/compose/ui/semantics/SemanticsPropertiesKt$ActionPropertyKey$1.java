package androidx.compose.ui.semantics;

import kotlin.A;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt$ActionPropertyKey$1\n*L\n1#1,1617:1\n*E\n"})
public final class SemanticsPropertiesKt$ActionPropertyKey$1<T> extends Lambda implements ed.p<a<T>, a<T>, a<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 f104091d = new SemanticsPropertiesKt$ActionPropertyKey$1();

    public SemanticsPropertiesKt$ActionPropertyKey$1() {
        super(2);
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final a<T> invoke(@Nullable a<T> aVar, @NotNull a<T> aVar2) {
        String str;
        A a10;
        if (aVar == null || (str = aVar.f104099a) == null) {
            str = aVar2.f104099a;
        }
        if (aVar == null || (a10 = aVar.f104100b) == null) {
            a10 = aVar2.f104100b;
        }
        return new a<>(str, a10);
    }
}
