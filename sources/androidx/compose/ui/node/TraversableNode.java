package androidx.compose.ui.node;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface TraversableNode extends InterfaceC2203g {

    /* JADX INFO: renamed from: S2, reason: collision with root package name */
    @NotNull
    public static final Companion f103016S2 = Companion.f103017a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f103017a = new Companion();

        public enum TraverseDescendantsAction {
            ContinueTraversal,
            SkipSubtreeAndContinueTraversal,
            CancelTraversal
        }
    }

    @NotNull
    Object v1();
}
