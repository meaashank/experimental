package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KeyEvent f102100a;

    public /* synthetic */ c(KeyEvent keyEvent) {
        this.f102100a = keyEvent;
    }

    public static final /* synthetic */ c a(KeyEvent keyEvent) {
        return new c(keyEvent);
    }

    @NotNull
    public static KeyEvent b(@NotNull KeyEvent keyEvent) {
        return keyEvent;
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof c) && G.g(keyEvent, ((c) obj).f102100a);
    }

    public static final boolean d(KeyEvent keyEvent, KeyEvent keyEvent2) {
        return G.g(keyEvent, keyEvent2);
    }

    public static int f(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String g(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    @NotNull
    public final KeyEvent e() {
        return this.f102100a;
    }

    public boolean equals(Object obj) {
        return c(this.f102100a, obj);
    }

    public final /* synthetic */ KeyEvent h() {
        return this.f102100a;
    }

    public int hashCode() {
        return this.f102100a.hashCode();
    }

    public String toString() {
        return g(this.f102100a);
    }
}
