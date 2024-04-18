import React from 'react';
import { Route } from 'react-router-dom';

import ErrorBoundaryRoutes from 'app/shared/error/error-boundary-routes';

import Table13 from './table-13';
import Table13Detail from './table-13-detail';
import Table13Update from './table-13-update';
import Table13DeleteDialog from './table-13-delete-dialog';

const Table13Routes = () => (
  <ErrorBoundaryRoutes>
    <Route index element={<Table13 />} />
    <Route path="new" element={<Table13Update />} />
    <Route path=":id">
      <Route index element={<Table13Detail />} />
      <Route path="edit" element={<Table13Update />} />
      <Route path="delete" element={<Table13DeleteDialog />} />
    </Route>
  </ErrorBoundaryRoutes>
);

export default Table13Routes;
