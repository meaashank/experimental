package p7;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.I;
import c7.x;

/* JADX INFO: loaded from: classes6.dex */
public class b extends AbstractC2950b<IInterface> {
    public b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        g(new x());
        f(new I("dataChanged", null));
        f(new I("clearBackupData", null));
        f(new I("agentConnected", null));
        f(new I("agentDisconnected", null));
        f(new I("restoreAtInstall", null));
        f(new I("setBackupEnabled", null));
        f(new I("setBackupProvisioned", null));
        f(new I("backupNow", null));
        f(new I("fullBackup", null));
        f(new I("fullTransportBackup", null));
        f(new I("fullRestore", null));
        f(new I("acknowledgeFullBackupOrRestore", null));
        f(new I("getCurrentTransport", null));
        f(new I("listAllTransports", new String[0]));
        f(new I("selectBackupTransport", null));
        Boolean bool = Boolean.FALSE;
        f(new I("isBackupEnabled", bool));
        f(new I("setBackupPassword", Boolean.TRUE));
        f(new I("hasBackupPassword", bool));
        f(new I("beginRestoreSession", null));
        f(new I("isBackupServiceActive", bool));
        f(new I("isBackupEnabledForUser", bool));
        f(new I("setBackupServiceActive", null));
        f(new I("setBackupEnabledForUser", null));
    }
}
