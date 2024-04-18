import React from 'react';
import { Route } from 'react-router-dom';

import ErrorBoundaryRoutes from 'app/shared/error/error-boundary-routes';

import Table19 from './table-19';
import Table19Detail from './table-19-detail';
import Table19Update from './table-19-update';
import Table19DeleteDialog from './table-19-delete-dialog';

const Table19Routes = () => (
  <ErrorBoundaryRoutes>
    <Route index element={<Table19 />} />
    <Route path="new" element={<Table19Update />} />
    <Route path=":id">
      <Route index element={<Table19Detail />} />
      <Route path="edit" element={<Table19Update />} />
      <Route path="delete" element={<Table19DeleteDialog />} />
    </Route>
  </ErrorBoundaryRoutes>
);

export default Table19Routes;
