package com.inmobi.media;

import com.inmobi.media.cd;
import ed.InterfaceC4376a;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class cd extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dd f152801a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(dd ddVar) {
        super(0);
        this.f152801a = ddVar;
    }

    @Override // ed.InterfaceC4376a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Runnable invoke() {
        final dd ddVar = this.f152801a;
        return new Runnable() { // from class: F5.X0
            @Override // java.lang.Runnable
            public final void run() {
                cd.a(ddVar);
            }
        };
    }

    public static final void a(dd this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        Objects.toString(this$0);
        this$0.f152826c.post((Yc) this$0.f152834k.getValue());
    }
}
