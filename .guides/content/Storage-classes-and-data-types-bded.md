Each column in a table is designed to store a particular type of data. For example, in our DRINK table, the DESCRIPTION column will only ever store text data. Here are the main data types you can use in SQLite, and what they can store:

<table style="width:100%">
  <tr>
    <th>Type</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Integer</td>
    <td>Any integer type</td>
  </tr>
  <tr>
    <td>Text</td>
    <td>Any character type</td>
  </tr>
  <tr>
    <td>Real</td>
    <td>Any floating-point number</td>
  </tr>
  <tr>
    <td>Numeric</td>
    <td>Booleans, dates, and date-times</td>
  </tr>
    <tr>
    <td>Blob</td>
    <td>Binary Large Object</td>
  </tr>
</table>

Unlike most database systems, you don’t need to specify the column size in SQLite. Under the hood, the data type is translated into a much broader storage class. This means you can say very generally what kind of data you’re going to store, but you’re not forced to be specific about the size of data.
