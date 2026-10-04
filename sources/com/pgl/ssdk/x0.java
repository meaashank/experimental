package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.a1;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class x0 extends a1 implements y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f161945b;

    public x0(HandlerThread handlerThread, a1.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.f161945b = handlerThread;
    }

    public void a(a1.a aVar) {
        this.f161801a = new WeakReference<>(aVar);
    }

    public void a(String str) {
        HandlerThread handlerThread = this.f161945b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
