package com.cookiegames.smartcookie.search;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.cookiegames.smartcookie.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.search.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C3133c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f147757e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ImageView f147758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TextView f147759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f147760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final View f147761d;

    public C3133c(@NotNull View view) {
        kotlin.jvm.internal.G.p(view, "view");
        View viewFindViewById = view.findViewById(p.j.f144609Za);
        kotlin.jvm.internal.G.o(viewFindViewById, "findViewById(...)");
        this.f147758a = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(p.j.f144745ic);
        kotlin.jvm.internal.G.o(viewFindViewById2, "findViewById(...)");
        this.f147759b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(p.j.f144569Wc);
        kotlin.jvm.internal.G.o(viewFindViewById3, "findViewById(...)");
        this.f147760c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(p.j.f144624ab);
        kotlin.jvm.internal.G.o(viewFindViewById4, "findViewById(...)");
        this.f147761d = viewFindViewById4;
    }

    @NotNull
    public final ImageView a() {
        return this.f147758a;
    }

    @NotNull
    public final View b() {
        return this.f147761d;
    }

    @NotNull
    public final TextView c() {
        return this.f147759b;
    }

    @NotNull
    public final TextView d() {
        return this.f147760c;
    }
}
