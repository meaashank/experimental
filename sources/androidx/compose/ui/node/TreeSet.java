package androidx.compose.ui.node;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 2)
public final class TreeSet<E> extends java.util.TreeSet<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f103018a = 0;

    public TreeSet(@NotNull Comparator<? super E> comparator) {
        super(comparator);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return super.size();
    }
}
