package androidx.compose.ui.node;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,491:1\n42#2,7:492\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n341#1:492,7\n*E\n"})
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f102998a = 16777215;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f102999b = -16777216;

    public static final void a(int i10, int i11) {
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return;
        }
        W.a.g("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }
}
