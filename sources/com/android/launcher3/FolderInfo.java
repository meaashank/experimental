package com.android.launcher3;

import android.os.Process;
import com.android.launcher3.LauncherSettings;
import com.android.launcher3.model.ModelWriter;
import com.android.launcher3.util.ContentWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class FolderInfo extends ItemInfo {
    public static final int FLAG_ITEMS_SORTED = 1;
    public static final int FLAG_MULTI_PAGE_ANIMATION = 4;
    public static final int FLAG_WORK_FOLDER = 2;
    public static final int NO_FLAGS = 0;
    public ArrayList<ShortcutInfo> contents = new ArrayList<>();
    ArrayList<FolderListener> listeners = new ArrayList<>();
    public int options;

    public interface FolderListener {
        void onAdd(ShortcutInfo shortcutInfo, int i10);

        void onItemsChanged(boolean z10);

        void onRemove(ShortcutInfo shortcutInfo);

        void onTitleChanged(CharSequence charSequence);

        void prepareAutoUpdate();
    }

    public FolderInfo() {
        this.itemType = 2;
        this.user = Process.myUserHandle();
    }

    public void add(ShortcutInfo shortcutInfo, boolean z10) {
        add(shortcutInfo, this.contents.size(), z10);
    }

    public void addListener(FolderListener folderListener) {
        this.listeners.add(folderListener);
    }

    public boolean hasOption(int i10) {
        return (i10 & this.options) != 0;
    }

    public void itemsChanged(boolean z10) {
        for (int i10 = 0; i10 < this.listeners.size(); i10++) {
            this.listeners.get(i10).onItemsChanged(z10);
        }
    }

    @Override // com.android.launcher3.ItemInfo
    public void onAddToDatabase(ContentWriter contentWriter) {
        super.onAddToDatabase(contentWriter);
        contentWriter.put("title", this.title).put(LauncherSettings.Favorites.OPTIONS, Integer.valueOf(this.options));
    }

    public void prepareAutoUpdate() {
        for (int i10 = 0; i10 < this.listeners.size(); i10++) {
            this.listeners.get(i10).prepareAutoUpdate();
        }
    }

    public void remove(ShortcutInfo shortcutInfo, boolean z10) {
        this.contents.remove(shortcutInfo);
        for (int i10 = 0; i10 < this.listeners.size(); i10++) {
            this.listeners.get(i10).onRemove(shortcutInfo);
        }
        itemsChanged(z10);
    }

    public void removeListener(FolderListener folderListener) {
        this.listeners.remove(folderListener);
    }

    public void setOption(int i10, boolean z10, ModelWriter modelWriter) {
        int i11 = this.options;
        if (z10) {
            this.options = i10 | i11;
        } else {
            this.options = (~i10) & i11;
        }
        if (modelWriter == null || i11 == this.options) {
            return;
        }
        modelWriter.updateItemInDatabase(this);
    }

    public void setTitle(CharSequence charSequence) {
        this.title = charSequence;
        for (int i10 = 0; i10 < this.listeners.size(); i10++) {
            this.listeners.get(i10).onTitleChanged(charSequence);
        }
    }

    public void add(ShortcutInfo shortcutInfo, int i10, boolean z10) {
        int iBoundToRange = Utilities.boundToRange(i10, 0, this.contents.size());
        this.contents.add(iBoundToRange, shortcutInfo);
        for (int i11 = 0; i11 < this.listeners.size(); i11++) {
            this.listeners.get(i11).onAdd(shortcutInfo, iBoundToRange);
        }
        itemsChanged(z10);
    }
}
