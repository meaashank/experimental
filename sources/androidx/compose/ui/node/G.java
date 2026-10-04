package androidx.compose.ui.node;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return LayoutNode.u((LayoutNode) obj, (LayoutNode) obj2);
    }
}
