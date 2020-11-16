package com.zyc.bottombar.library;

import androidx.annotation.NonNull;

class BatchTabPropertyApplier { // ha
  private final com.zyc.android.bottombar.BottomBar bottomBar;

  interface TabPropertyUpdater {
    void update(BottomBarTab tab);
  }

  BatchTabPropertyApplier(@NonNull com.zyc.android.bottombar.BottomBar bottomBar) {
    this.bottomBar = bottomBar;
  }

  void applyToAllTabs(@NonNull TabPropertyUpdater propertyUpdater) {
    int tabCount = bottomBar.getTabCount();

    if (tabCount > 0) {
      for (int i = 0; i < tabCount; i++) {
        BottomBarTab tab = bottomBar.getTabAtPosition(i);
        propertyUpdater.update(tab);
      }
    }
  }
}
