# AUTLE

**AUTLE** stands for **AUT**omatic **L**ayout by **E**xamples, which targets on helping programmers layout design classes automatically by given examples.

## Installation

To install the AUTLE plugin, put **jar\\autle\_1\_0\\AUTLE_1.0.0.jar** into your Eclipse plugin directory, and restart your Eclipse.

## Manual Class Layout

AUTLE supports manual class layout on **Grid Matrix**. The programmer can simply drag design classes from left package view window, and drop them on the AUTLE grid matrix. The class figures will automatically visualized on the grid matrix right where the dragged classes were dropped. The programmer can move the classes anywhere he want on grid matrix

## Layout Template Creation

The programmer create the layout template according to current class layout. After manual class layout, if the class layout is meaningful to the programmer, he may want to keep and reuse the layout rules. The programmer can do this by click the **AUTLE Command -> Layout Template Creation** on popup menybar.
AUTLE asks the programmer for newly created template name, and creates a special template file, such as
observer.atpl, in physical file system. In the meantime, current grid matrix will be applied the newly created template. Those grids with labels will turn yellow.

The labels in each grid can be checked by the tips of each grid. When the mouse is moved on the grid, tips
wille be poped up to tell the programmer what pattern label is added to this grid. When the programmer again drags a class from package view window to the grid matrix, this time the dropped
classes will be automatically layout to approrpiate grids

## Apply Existed Layout Template

The programmer can apply an exisitng layout template in the same way as creating a template. The **AUTLE
Command -> Apply Layout Template** on popup menybar will pops up a dialog to ask for needed template name.
The template will be loaded into current grid matrix, and those grids with labels will be marked yellow as well.

## Publication

 * W.-C. Hu and H. C. Jiau, "**Class Diagram Layout by Design Pattern Examples**," The 20th Workshop on Object-Oriented Technology and Applications, Nov. 2009.