/*
 * Kiwix Android
 * Copyright (c) 2023 Kiwix <android.kiwix.org>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.kiwix.kiwixmobile.core.di.modules

import android.app.NotificationManager
import android.content.Context
import dagger.Module
import dagger.Provides
import org.kiwix.kiwixmobile.core.di.CoreServiceScope
import org.kiwix.kiwixmobile.core.read_aloud.ReadAloudNotificationManger

@Module
class CoreServiceModule {
  @Provides
  @CoreServiceScope
  fun providesReadAloudNotificationManager(
    notificationManager: NotificationManager,
    context: Context
  ): ReadAloudNotificationManger = ReadAloudNotificationManger(notificationManager, context)
}
