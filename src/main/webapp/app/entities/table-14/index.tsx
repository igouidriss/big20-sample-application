import React from 'react';
import { Route } from 'react-router-dom';

import ErrorBoundaryRoutes from 'app/shared/error/error-boundary-routes';

import Table14 from './table-14';
import Table14Detail from './table-14-detail';
import Table14Update from './table-14-update';
import Table14DeleteDialog from './table-14-delete-dialog';

const Table14Routes = () => (
  <ErrorBoundaryRoutes>
    <Route index element={<Table14 />} />
    <Route path="new" element={<Table14Update />} />
    <Route path=":id">
      <Route index element={<Table14Detail />} />
      <Route path="edit" element={<Table14Update />} />
      <Route path="delete" element={<Table14DeleteDialog />} />
    </Route>
  </ErrorBoundaryRoutes>
);

export default Table14Routes;
