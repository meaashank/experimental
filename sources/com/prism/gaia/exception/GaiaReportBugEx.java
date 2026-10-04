package com.prism.gaia.exception;

/* JADX INFO: loaded from: classes6.dex */
public class GaiaReportBugEx extends RuntimeException {
    private static final long serialVersionUID = 1;

    public GaiaReportBugEx() {
    }

    public GaiaReportBugEx(Throwable th) {
        super(th);
    }

    public GaiaReportBugEx(String str) {
        super(str);
    }

    public GaiaReportBugEx(String str, Throwable th) {
        super(str, th);
    }
}
