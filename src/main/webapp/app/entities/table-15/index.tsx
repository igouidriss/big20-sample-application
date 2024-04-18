import React from 'react';
import { Route } from 'react-router-dom';

import ErrorBoundaryRoutes from 'app/shared/error/error-boundary-routes';

import Table15 from './table-15';
import Table15Detail from './table-15-detail';
import Table15Update from './table-15-update';
import Table15DeleteDialog from './table-15-delete-dialog';

const Table15Routes = () => (
  <ErrorBoundaryRoutes>
    <Route index element={<Table15 />} />
    <Route path="new" element={<Table15Update />} />
    <Route path=":id">
      <Route index element={<Table15Detail />} />
      <Route path="edit" element={<Table15Update />} />
      <Route path="delete" element={<Table15DeleteDialog />} />
    </Route>
  </ErrorBoundaryRoutes>
);

export default Table15Routes;
