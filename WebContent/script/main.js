$(document).ready( function() {

  /* Get the JSON data from getJSONData.action */ 
  $.getJSON('getJSONData.action', function(data) {
    /* Create the table */
    var table = $('<table></table>').attr( 'id', 'fancyTable' );
    table.addClass( 'tablesorter' );
    var thead = $('<thead></thead>');

    /* Create header row */
    var headerRow = $('<tr></tr>');
    $.each( data.earthQuakeList[0], function( key, value ) {
      headerRow.append( $('<th></th>').text( key ) );
    });
    thead.append( headerRow );
    table.append( thead );

    var tbody = $('<tbody></tbody>');

    /* Not a very flexible way to retrieve the json data but for now it'll do */
    for( var i = 0; i < data.earthQuakeList.length; i++ ) {
      /* Create a row for each entry */
      var row = $('<tr></tr>');
      
      /* Add cells with the info */
      $.each( data.earthQuakeList[i], function( key, value ) {
        row.append( $('<td></td>').text( value ) );
      });
      
      /* Append to tbody */
      tbody.append( row );
    }

    /* Append to the table */
    table.append( tbody );


    /* Integrate tablesorter plugin */

    /* Add pager plugin */
    var pager = $('<div></div>').attr( 'id', 'pager' );
    pager.addClass( 'pager' );
    /* Pager plugin is not documented well, we have to create the entire DOM for the pager first */
    pager.html('<form><img src="image/icons/first.png" class="first"/><img src="image/icons/prev.png" class="prev"/><input type="text" class="pagedisplay"/><img src="image/icons/next.png" class="next"/><img src="image/icons/last.png" class="last"/><select class="pagesize"><option selected="selected"  value="10">10</option><option value="20">20</option><option value="30">30</option><option value="40">40</option></select></form>');
    table.tablesorter({
      sortList: [ [0,0] ],
      widthFixed: true
    })

    /* Remove loading gif */
    $('#loading').hide();

    /* Add to existing html */
    $('#jtable').append( table );
    /* Add afterwards so offsetheight (which is used to absolutely position the pager) exists when adding pager */
    $('#fancyTable').tablesorterPager( { container: pager } );
    $('#jtable').append( pager );

  });/* End getJSON */

});/* End document.ready */
