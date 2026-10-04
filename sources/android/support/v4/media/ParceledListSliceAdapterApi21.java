package android.support.v4.media;

import android.media.browse.MediaBrowser;
import e.T;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@T(21)
class ParceledListSliceAdapterApi21 {
    private static Constructor sConstructor;

    static {
        try {
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            e = e10;
        }
        try {
            sConstructor = Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class);
        } catch (NoSuchMethodException e11) {
            e = e11;
            e.printStackTrace();
        }
    }

    private ParceledListSliceAdapterApi21() {
    }

    public static Object newInstance(List<MediaBrowser.MediaItem> list) {
        try {
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            e = e10;
        }
        try {
            return sConstructor.newInstance(list);
        } catch (IllegalAccessException e11) {
            e = e11;
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e12) {
            e = e12;
            e.printStackTrace();
            return null;
        }
    }
}
