package Da;

import android.annotation.SuppressLint;
import com.google.android.material.timepicker.TimeModel;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d implements Fa.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Fa.c f23038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Fa.d f23039b;

    @SuppressLint({"DefaultLocale"})
    public String i(long j10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = (int) (j10 / 3600000);
        long j11 = j10 % 3600000;
        int i11 = (int) (j11 / 60000);
        int i12 = (int) ((j11 % 60000) / 1000);
        if (i10 > 0) {
            sb2.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i10)));
            sb2.append(com.prism.gaia.server.accounts.b.f166434b0);
        }
        sb2.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i11)));
        sb2.append(com.prism.gaia.server.accounts.b.f166434b0);
        sb2.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i12)));
        return sb2.toString();
    }

    public void j(int i10) {
        Fa.c cVar = this.f23038a;
        if (cVar != null) {
            cVar.l(i10);
        }
    }

    public void k(long j10) {
        Fa.d dVar = this.f23039b;
        if (dVar != null) {
            dVar.C0(j10);
        }
    }

    public void l() {
        Fa.d dVar = this.f23039b;
        if (dVar != null) {
            dVar.W();
        }
    }

    public void m(long j10, long j11, long j12) {
        Fa.d dVar = this.f23039b;
        if (dVar != null) {
            dVar.m(j10, j11, j12);
        }
    }

    public void o() {
        b();
    }

    public void p(Fa.c cVar) {
        this.f23038a = cVar;
    }

    public void q(Fa.d dVar) {
        this.f23039b = dVar;
    }

    public void n() {
    }
}
