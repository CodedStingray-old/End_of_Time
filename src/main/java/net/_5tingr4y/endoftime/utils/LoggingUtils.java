/*
 * This file is part of OpenRPG, a small open-source RPG game.
 * Copyright (C) 2017  Raymond "5tingr4y" Kampmann <https://5tingr4y.net>
 *
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net._5tingr4y.endoftime.utils;

import java.util.Map;

public class LoggingUtils {

    public static String mapAsTable(Map<?, ?> map) {
        return mapAsTable(map, " : ");
    }

    public static String mapAsTable(Map<?, ?> map, String delimiter) {
        //TODO: align delimiters, sort alphabetically

        StringBuilder sb = new StringBuilder();

        for(Object key: map.keySet()) {
            sb.append(key).append(delimiter).append(map.get(key)).append('\n');
        }

        return sb.toString();
    }
}
