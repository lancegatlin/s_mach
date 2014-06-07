/*
    Copyright 2013 Lance Gatlin

    Author: lance.gatlin@gmail.com

    This file is part of org.s_mach library.

    org.s_mach library is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    org.s_mach library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with org.s_mach library. If not, see <http://www.gnu.org/licenses/>.

*/
package org.s_mach.Enumerator

case class Progress(n : Int, maxN : Int) {
  def percentComplete = (n.toDouble / maxN.toDouble) * 100.0
}
object Progress {
  val empty = Progress(0,0)
}