package com.cookiegames.smartcookie.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import g.C4426a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class SearchView extends AppCompatAutoCompleteTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f148314d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public a f148315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f148316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f148317c;

    public interface a {
        void a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @dd.k
    public SearchView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.G.p(context, "context");
    }

    @Nullable
    public final a a() {
        return this.f148315a;
    }

    public final boolean b(long j10) {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j10) >= ((long) ViewConfiguration.getLongPressTimeout());
    }

    public final void c(@Nullable a aVar) {
        this.f148315a = aVar;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        a aVar;
        kotlin.jvm.internal.G.p(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.f148317c = System.nanoTime();
            this.f148316b = true;
        } else if (action != 1) {
            if (action == 3) {
                this.f148316b = false;
            }
        } else if (this.f148316b && !b(this.f148317c) && (aVar = this.f148315a) != null) {
            aVar.a();
        }
        return super.onTouchEvent(event);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @dd.k
    public SearchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.G.p(context, "context");
    }

    public /* synthetic */ SearchView(Context context, AttributeSet attributeSet, int i10, int i11, C4969v c4969v) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? C4426a.b.f200795S : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dd.k
    public SearchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.G.p(context, "context");
    }
}
