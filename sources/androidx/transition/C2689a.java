package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.transition.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2689a {

    /* JADX INFO: renamed from: androidx.transition.a$a, reason: collision with other inner class name */
    public interface InterfaceC0334a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    public static void a(@NonNull Animator animator, @NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    public static void b(@NonNull Animator animator) {
        animator.pause();
    }

    public static void c(@NonNull Animator animator) {
        animator.resume();
    }
}
