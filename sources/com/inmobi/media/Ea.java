package com.inmobi.media;

import androidx.activity.C1477d;

/* JADX INFO: loaded from: classes5.dex */
public final class Ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151908a;

    public Ea(int i10) {
        this.f151908a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ea) && this.f151908a == ((Ea) obj).f151908a;
    }

    public final int hashCode() {
        return this.f151908a;
    }

    public final String toString() {
        return C1477d.a(new StringBuilder("RenderViewTelemetryData(maxTemplateEvents="), this.f151908a, ')');
    }
}
